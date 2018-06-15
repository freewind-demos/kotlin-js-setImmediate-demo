kotlin-js-setImmediate-demo
=======================

Use npm lib `setimmediate` to run some function after current function in browser with Kotlin.


Run:

```
npm install
npm install -g browserify
browserify -r setimmediate > deps-bundle.js
./gradlew compileKotlin2Js
open index.html
```

You will see two alerts, the first one is run inside the function, and the later one is run with `setImmediate`.


