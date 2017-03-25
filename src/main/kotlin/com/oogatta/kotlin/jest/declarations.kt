@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

package com.oogatta.kotlin.jest

import kotlin.js.*
import com.oogatta.kotlin.jest.jest.*
import com.oogatta.kotlin.jest.jasmine.*

external var beforeAll: Lifecycle = definedExternally
external var beforeEach: Lifecycle = definedExternally
external var afterAll: Lifecycle = definedExternally
external var afterEach: Lifecycle = definedExternally
external var describe: Describe = definedExternally
external var fdescribe: Describe = definedExternally
external var xdescribe: Describe = definedExternally
external var it: It = definedExternally
external var fit: It = definedExternally
external var xit: It = definedExternally
external var test: It = definedExternally
external var xtest: It = definedExternally
external fun expect(actual: Any): Matchers = definedExternally
external interface NodeRequire {
    fun requireActual(moduleName: String): Any
    fun requireMock(moduleName: String): Any
}
external fun spyOn(`object`: Any, method: String): Spy = definedExternally
external fun pending(reason: String? = definedExternally /* null */): Unit = definedExternally
external fun fail(error: Any? = definedExternally /* null */): Unit = definedExternally
