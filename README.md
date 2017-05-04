# TODO

  - [x] change namespace to somewhere else
  - [x] make gradle do these compiling jobs.

# Current files

  - Converted from https://github.com/DefinitelyTyped/DefinitelyTyped/blob/ecbeaa15c0a5816067fe267f574c1705e51e773e/jest/index.d.ts (jest 16.00).
  - Current ts2kt can handle d.ts files from TypeScript <= 2.0.
  - And some tweak...

# Make jar

```
$ gradle jar
```

# Use


```gradle
dependencies {
    testCompile "org.jetbrains.kotlin:kotlin-test-js:$kotlin_version"
    testCompile files("typings/jest-kotlin-type-declaration.jar")
}
```

```kotlin
package com.example

import com.oogatta.kotlin.jestdefinitions.*

fun main(args: Array<String>) {
    test("3 equals 3") {
        expect(3).toBe(3)
    }
}
```
