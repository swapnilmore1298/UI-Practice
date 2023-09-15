# Responsive Design

## Viewport

Set viewport related properties for your page using meta tag as below withn `<head>` tag.

When provided `width=device-width` gives our design a mobile friendly approach.

```
<meta name="viewport" content="width=device-width, initial-scale=1.0">

```
`width=device-width`:sets the width of the viewport to the width of the device's screen. It ensures that your web page's content is initially displayed at the correct width on the device.

`initial-scale=1.0`: sets the initial zoom level to 100%, meaning that the web page is not zoomed in or out when first loaded.

`user-scalable=yes or user-scalable=no`: control whether the user can zoom in or out on the web page using pinch gestures. Setting it to "yes" allows zooming, while "no" prevents it.

`maximum-scale and minimum-scale`: limit the maximum and minimum zoom levels allowed by the user.

## Fluid layouts

- Use % or em for width, margin or paddings
- Use rem or em for font sizes

## Media Queries

- used to apply styles based on various characteristics of the user's device, such as screen width, height, orientation, and more
- syntax :
  ```
  @media media-type and (media-feature) {...}
  ```
- example : 
  ```
  @media screen and (max-width: 768px) 
  {
    /* Styles for screens with a maximum width of 768px */
  }
  ```

  - media-type - can be screen, print, etc..
  - media-feature - can be any of following

- width: Specifies the width of the viewport.
- height: Specifies the height of the viewport.
- min-width and max-width: Set minimum and maximum width thresholds.
- orientation: Targets the orientation of the device (landscape or portrait).
- aspect-ratio: Defines the aspect ratio of the viewport.
- device-pixel-ratio: Specifies the device's pixel density (e.g., Retina displays).


example :

```
/* Default styles for larger screens */
.container {
  width: 80%;
  margin: 0 auto;
}

/* Media query for smaller screens */
@media screen and (max-width: 768px) {
  .container {
    width: 100%;
    padding: 10px;
  }
}

```