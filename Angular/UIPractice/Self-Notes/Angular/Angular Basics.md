# Angular Notes

## Routing

### Define paths

```
<!-- Path is url and component is page to load -->
const appRoutes: Routes = [
    { path: 'dashboard', component: DashboardComponent },
    { path: '', redirectTo: '/dashboard', pathMatch: 'full' },
    { path: 'books', component: BookComponent },
    { path: 'detail/:id', component: BookDetailComponent },
    { path: '**', component: PageNotFoundComponent },
];
```
Notes:
- Always define a path for "" (empty path) and using redirectTo navigate to your expected path. [Login page mostly]
-  `pathMatch: 'full'` tells Router to match the given path completely. pathMatch has another value called 'prefix' where it checks if the path begins with the given prefix
-  `path: 'detail/:id'` here we receive id as route parameter so that corresponding book details can be loaded when new page is rendered.
-  route configuration must be provided for the wildcard route '**'. When users attempt to navigate to a route which may not be existing in your application, the application should be in a position to handle this gracefully


### Mode of Navigation

- **Hyperlink based**
- **Prorgrammatical**
  
#### Hyperlink based

- `RouterLink` directive can be used with the anchor tag 

  ```
    <nav>
        <a [routerLink]='["/dashboard"]' routerLinkActive="active">Dashboard</a>
        <a [routerLink]='["/books"]' routerLinkActive="active">Books</a>
    </nav>
  ```

- `routerLinkActive` applies CSS active properties to the recently clicked Anchor
- ` <router-outlet>` is where the output of selected component will be rendered.

#### Programmatical

- `navigate()` method of `Router` class is used
- Takes two parameters, Route url and parameters.
```
this.router.navigate([url, parameters]);
this.router.navigate(['/detail', book.id])
```

### Accessing RouteParams

```
constructor(private route: ActivatedRoute)
...
ngOnInit(){
    this.route.paramMap.subscribe(params =>{
        let selectedID = params.get('id')
    });
}

<!--
given path is defined as
    { path: 'detail/:id', component: BookDetailComponent },
  -->
```

### RouteGuards

Angular has canActivate interface which can be used to check if a user is logged in to access a component

canActivate() method must be overridden in the guard class as shown below:
```
Class GuardService implements CanActivate{
  canActivate( ): boolean {
  }
}
<!-- Using canActivate, access can be permitted to only authenticated users. -->

canActivate(): boolean {
        if (this.loginService.isUserLoggedIn()) {
            return true;
        }
        this.router.navigate(['/login']);
        return false;
}
```

```
{ path: 'books', component: BookComponent, canActivate:[LoginGuardService] }
```


### Async Routing

```
{ path: 'books', loadChildren: () => import('./book/book.module').then(m => m.BookModule) }
```