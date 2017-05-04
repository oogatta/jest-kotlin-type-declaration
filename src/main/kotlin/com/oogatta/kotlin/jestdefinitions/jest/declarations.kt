@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")
@file:[JsQualifier("jest")]

// 1.0.5

package com.oogatta.kotlin.jestdefinitions.jest

import kotlin.js.*
import com.oogatta.kotlin.jestdefinitions.jasmine.*

external val oogatta: dynamic = definedExternally

external fun addMatchers(matchers: CustomMatcherFactories): dynamic /* "TypeQuery" kind unsupported yet here! (index.d.ts:29:68 to 29:80) */ = definedExternally
external fun autoMockOff(): dynamic /* "TypeQuery" kind unsupported yet here! (index.d.ts:31:28 to 31:40) */ = definedExternally
external fun autoMockOn(): dynamic /* "TypeQuery" kind unsupported yet here! (index.d.ts:33:27 to 33:39) */ = definedExternally
external fun clearAllMocks(): dynamic /* "TypeQuery" kind unsupported yet here! (index.d.ts:35:30 to 35:42) */ = definedExternally
external fun clearAllTimers(): dynamic /* "TypeQuery" kind unsupported yet here! (index.d.ts:37:31 to 37:43) */ = definedExternally
external fun deepUnmock(moduleName: String): dynamic /* "TypeQuery" kind unsupported yet here! (index.d.ts:39:45 to 39:57) */ = definedExternally
external fun disableAutomock(): dynamic /* "TypeQuery" kind unsupported yet here! (index.d.ts:41:32 to 41:44) */ = definedExternally
external fun doMock(moduleName: String): dynamic /* "TypeQuery" kind unsupported yet here! (index.d.ts:43:41 to 43:53) */ = definedExternally
external fun dontMock(moduleName: String): dynamic /* "TypeQuery" kind unsupported yet here! (index.d.ts:45:43 to 45:55) */ = definedExternally
external fun enableAutomock(): dynamic /* "TypeQuery" kind unsupported yet here! (index.d.ts:47:31 to 47:43) */ = definedExternally
external fun <T> fn(implementation: Function<*>? = definedExternally /* null */): Mock<T> = definedExternally
external fun <T> genMockFromModule(moduleName: String): T = definedExternally
external fun isMockFunction(fn: Any): Boolean = definedExternally
external fun mock(moduleName: String, factory: Any? = definedExternally /* null */, options: MockOptions? = definedExternally /* null */): dynamic /* "TypeQuery" kind unsupported yet here! (index.d.ts:55:77 to 55:89) */ = definedExternally
external fun resetModuleRegistry(): dynamic /* "TypeQuery" kind unsupported yet here! (index.d.ts:57:36 to 57:48) */ = definedExternally
external fun resetModules(): dynamic /* "TypeQuery" kind unsupported yet here! (index.d.ts:59:29 to 59:41) */ = definedExternally
external fun runAllImmediates(): dynamic /* "TypeQuery" kind unsupported yet here! (index.d.ts:61:33 to 61:45) */ = definedExternally
external fun runAllTicks(): dynamic /* "TypeQuery" kind unsupported yet here! (index.d.ts:63:28 to 63:40) */ = definedExternally
external fun runAllTimers(): dynamic /* "TypeQuery" kind unsupported yet here! (index.d.ts:65:29 to 65:41) */ = definedExternally
external fun runOnlyPendingTimers(): dynamic /* "TypeQuery" kind unsupported yet here! (index.d.ts:68:37 to 68:49) */ = definedExternally
external fun runTimersToTime(msToRun: Number): dynamic /* "TypeQuery" kind unsupported yet here! (index.d.ts:70:47 to 70:59) */ = definedExternally
external fun <T> setMock(moduleName: String, moduleExports: T): dynamic /* "TypeQuery" kind unsupported yet here! (index.d.ts:72:63 to 72:75) */ = definedExternally
external fun unmock(moduleName: String): dynamic /* "TypeQuery" kind unsupported yet here! (index.d.ts:74:41 to 74:53) */ = definedExternally
external fun useFakeTimers(): dynamic /* "TypeQuery" kind unsupported yet here! (index.d.ts:76:30 to 76:42) */ = definedExternally
external fun useRealTimers(): dynamic /* "TypeQuery" kind unsupported yet here! (index.d.ts:78:30 to 78:42) */ = definedExternally
external interface MockOptions {
    var virtual: Boolean? get() = definedExternally; set(value) = definedExternally
}
external interface EmptyFunction {
    @nativeInvoke
    operator fun invoke()
}
external interface `T$0` {
    var message: String
}
external interface DoneCallback {
    @nativeInvoke
    operator fun invoke(vararg args: Any): Any
    fun fail(error: String? = definedExternally /* null */): Any
    fun fail(error: `T$0`? = definedExternally /* null */): Any
}
external interface ProvidesCallback {
    @nativeInvoke
    operator fun invoke(cb: DoneCallback): Any
}
external interface Lifecycle {
    @nativeInvoke
    operator fun invoke(fn: ProvidesCallback): Any
}
external interface It {
    @nativeInvoke
    operator fun invoke(name: String, fn: dynamic)
    var only: It
    var skip: It
    var concurrent: It
}
external interface Describe {
    @nativeInvoke
    operator fun invoke(name: String, fn: EmptyFunction)
    var only: Describe
    var skip: Describe
}
external interface Matchers {
    var not: Matchers
    fun lastCalledWith(vararg args: Any)
    fun toBe(expected: Any)
    fun toBeCalled()
    fun toBeCalledWith(vararg args: Any)
    fun toBeCloseTo(expected: Number, delta: Number)
    fun toBeDefined()
    fun toBeFalsy()
    fun toBeGreaterThan(expected: Number)
    fun toBeGreaterThanOrEqual(expected: Number)
    fun toBeInstanceOf(expected: Any)
    fun toBeLessThan(expected: Number)
    fun toBeLessThanOrEqual(expected: Number)
    fun toBeNull()
    fun toBeTruthy()
    fun toBeUndefined()
    fun toContain(expected: Any)
    fun toContainEqual(expected: Any)
    fun toEqual(expected: Any)
    fun toHaveBeenCalled(): Boolean
    fun toHaveBeenCalledTimes(expected: Number): Boolean
    fun toHaveBeenCalledWith(vararg params: Any): Boolean
    fun toHaveBeenLastCalledWith(vararg params: Any): Boolean
    fun toMatch(expected: String)
    fun toMatch(expected: RegExp)
    fun toMatchObject(expected: Any)
    fun toMatchSnapshot()
    fun toThrow()
    fun toThrowError(error: String? = definedExternally /* null */)
    fun toThrowError(error: Constructable? = definedExternally /* null */)
    fun toThrowError(error: RegExp? = definedExternally /* null */)
    fun toThrowErrorMatchingSnapshot()
}
external interface Constructable
external interface Mock<T> {
    @nativeInvoke
    operator fun invoke(vararg args: Any): Any
    var mock: MockContext<T>
    fun mockClear()
    fun mockImplementation(fn: Function<*>): Mock<T>
    fun mockImplementationOnce(fn: Function<*>): Mock<T>
    fun mockReturnThis(): Mock<T>
    fun mockReturnValue(value: Any): Mock<T>
    fun mockReturnValueOnce(value: Any): Mock<T>
}
external interface MockContext<T> {
    var calls: Array<Array<Any>>
    var instances: Array<T>
}

external fun sugomock(moduleName: String, factory: Any? = definedExternally /* null */, options: MockOptions? = definedExternally /* null */): dynamic /* "TypeQuery" kind unsupported yet here! (index.d.ts:55:77 to 55:89) */ = definedExternally
