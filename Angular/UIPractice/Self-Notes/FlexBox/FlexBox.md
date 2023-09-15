# UI Concepts Practice

## CSS

Below we practice fundamentals of css

- Box fundamentals
- Box shadow
- Coloring
- Font style and sizing
- Cloning css

### Flex box

Flex box has 2 components

- Container : external component
- Flex Items : child components of flex box

We have different set of properties applicable to both types of components

Also Flex box has 2 axis systems

- main axis : horizontal/vertical based on flex direction
- cross axis : which is cross sectional axis to the flex direction

Both have there own size, start and end.

**Container Properties :**
```
.container {
    display : flex;
    flex-direction : row;
    flex-wrap : nowrap;
    justify-content : flex-start;
}
```

- flex-direction : row / row-reverse / column / column-reverse
- flex-wrap : nowrap / wrap/ wrap-reverse (bottom to top)
- flex-flow : column wrap / row nowrap (short hand of direction+wrap)

**justify content** :
- defines alignment along **main axis**
- distributes extra free space
- also some control for overflown flex items
- flex-start / flex-end / left / right
- center : all items are crowded in center
- space-between : item starts from left to right and spanned to fit through even spacing
- space-around : evenly distributed in the line with equal space around them.(visually the spaces aren’t equal)
- space-evenly : spacing between any two items (and the space to the edges) is equal

**align-items**:
- same as justify-content but on **Cross axis**.
- values : stretch | flex-start | flex-end | center | baseline | first baseline | last baseline | start | end | self-start | self-end + ... safe | unsafe;

**Gap**: 
space between flex items. between 2 rows as well
- gap: 10px 20px; /* row-gap column gap */
- row-gap: 10px;
- column-gap: 20px;

**Properties for the Children
(flex items)** :

These properties are applicable on css class of child items

```
.item
{
    order :  2;
    flex-grow : 3;
    flex-shrink : 2;
    flex-basis : 25px;

    flex: none | [ <'flex-grow'> <'flex-shrink'>? || <'flex-basis'> ]
    align-self: auto | flex-start | flex-end | center | baseline | stretch;
}
```
**order** : 
- when applied orders the items by assigned number
- if no property order is applied to some items, they will be as per source at the start of the list
- if order number is equal, source order is followed

**grow**:
- when assigned 1 to all items, space evenly assigned
- when other item gets higher values, more width assigned to it relatively with grow : 1 items

**shrink** :
- only visible change effect when the container width is not enough for items and might need to squeeze to fit in
- the items with higher shrink value will shrink first and relatively to amount of shrink assigned to it
  
**flex-basis** :
- specifies the initial size of a flex item along the main axis before any available space is distributed among the flex items
- later if any grow or shrink is applied, that will be applied on it but basis acts as initial width

**flex**(on item):
- shorthand for flex-grow, flex-shrink and flex-basis 
- default is `0 1 auto`
  
**align-self** :
- to override any pre inheritted alignment
- Note :- float, clear and vertical-align have no effect on a flex item



