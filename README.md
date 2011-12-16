Raphaël for Grails - Cross-browser vector graphics the easy way.
===

The Plugin provides the JavaScript Vector Library Raphaël.
It offers the un-minified version of the JavaScript-Library in the Development-Stage and the minified elseways.
It integrates nicely with the resources plugin.

What is it?
---
Raphaël is a small JavaScript library that should simplify your work with vector graphics on the web. If you want to create your own specific chart or image crop and rotate widget, for example, you can achieve it simply and easily with this library.
Raphaël ['ræfeɪəl] uses the SVG W3C Recommendation and VML as a base for creating graphics. This means every graphical object you create is also a DOM object, so you can attach JavaScript event handlers or modify them later. Raphaël’s goal is to provide an adapter that will make drawing vector art compatible cross-browser and easy.
Raphaël currently supports Firefox 3.0+, Safari 3.0+, Chrome 5.0+, Opera 9.5+ and Internet Explorer 6.0+.

To get started -- checkout http://raphaeljs.com/

Installation:
---
grails install-plugin raphael

Usage:
---
If you want to use it with the resources plugin http://grails.org/plugin/resources you can use the resources TagLib to include the raphael module in your gsp.

	<r:require module="raphael" />

For developers that don't use the resources plugin the raphael plugin also provides a TagLib that conviniently adds the raphael js library to your gsp. It
offers the same feature set regarding minified in non-dev-stage vs. un-minified in dev-stage.

	<ra:raphael />

Versioning
---
Plugin version conetion is <javascript-libraryversion>.<plugin-minor-for-fixes>

Copyright and License
---

raphael plugin:

Copyright © 2011 Konstantinos Kostarellis

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

Raphaël JavaScript Library:

The MIT License
Copyright © 2008 Dmitry Baranovskiy

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the “Software”), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED “AS IS”, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
