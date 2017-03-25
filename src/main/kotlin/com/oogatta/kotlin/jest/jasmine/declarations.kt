@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

package com.oogatta.kotlin.jest.jasmine

import kotlin.js.*

external var clock: () -> Clock = definedExternally
external fun any(aclass: Any): Any = definedExternally
external fun anything(): Any = definedExternally
external fun arrayContaining(sample: Array<Any>): ArrayContaining = definedExternally
external fun objectContaining(sample: Any): ObjectContaining = definedExternally
external fun createSpy(name: String, originalFn: Function<*>? = definedExternally /* null */): Spy = definedExternally
external fun createSpyObj(baseName: String, methodNames: Array<Any>): Any = definedExternally
external fun <T> createSpyObj(baseName: String, methodNames: Array<Any>): T = definedExternally
external fun pp(value: Any): String = definedExternally
external fun addCustomEqualityTester(equalityTester: CustomEqualityTester): Unit = definedExternally
external fun addMatchers(matchers: CustomMatcherFactories): Unit = definedExternally
external fun stringMatching(value: String): Any = definedExternally
external fun stringMatching(value: RegExp): Any = definedExternally
external interface Clock {
    fun install()
    fun uninstall()
    fun tick(ms: Number)
    fun mockDate(date: Date? = definedExternally /* null */)
}
//external interface Any {
//    fun jasmineMatches(other: Any): Boolean
//    fun jasmineToString(): String
//}
external interface ArrayContaining {
    fun asymmetricMatch(other: Any): Boolean
    fun jasmineToString(): String
}
external interface ObjectContaining {
    fun jasmineMatches(other: Any, mismatchKeys: Array<Any>, mismatchValues: Array<Any>): Boolean
    fun jasmineToString(): String
}
external interface `T$1` {
    var args: Array<Any>
}
external interface Spy {
    @nativeInvoke
    operator fun invoke(vararg params: Any): Any
    var identity: String
    var and: SpyAnd
    var calls: Calls
    var mostRecentCall: `T$1`
    var argsForCall: Array<Any>
    var wasCalled: Boolean
}
external interface SpyAnd {
    fun callThrough(): Spy
    fun returnValue(`val`: Any): Spy
    fun returnValues(vararg values: Any): Spy
    fun callFake(fn: Function<*>): Spy
    fun throwError(msg: String): Spy
    fun stub(): Spy
}
external interface Calls {
    fun any(): Boolean
    fun count(): Number
    fun argsFor(index: Number): Array<Any>
    fun allArgs(): Array<Any>
    fun all(): Array<CallInfo>
    fun mostRecent(): CallInfo
    fun first(): CallInfo
    fun reset()
}
external interface CallInfo {
    var `object`: Any
    var args: Array<Any>
    var returnValue: Any
}
external interface CustomMatcherFactories {
    @nativeGetter
    operator fun get(index: String): CustomMatcherFactory?
    @nativeSetter
    operator fun set(index: String, value: CustomMatcherFactory)
}
external interface CustomMatcherFactory {
    @nativeInvoke
    operator fun invoke(util: MatchersUtil, customEqualityTesters: Array<CustomEqualityTester>): CustomMatcher
}
external interface MatchersUtil {
    fun equals(a: Any, b: Any, customTesters: Array<CustomEqualityTester>? = definedExternally /* null */): Boolean
    fun <T> contains(haystack: ArrayLike<T>, needle: Any, customTesters: Array<CustomEqualityTester>? = definedExternally /* null */): Boolean
    fun <T> contains(haystack: String, needle: Any, customTesters: Array<CustomEqualityTester>? = definedExternally /* null */): Boolean
    fun buildFailureMessage(matcherName: String, isNot: Boolean, actual: Any, vararg expected: Any): String
}
external interface CustomEqualityTester {
    @nativeInvoke
    operator fun invoke(first: Any, second: Any): Boolean
}
external interface CustomMatcher {
    fun <T> compare(actual: T, expected: T): CustomMatcherResult
    fun compare(actual: Any, expected: Any): CustomMatcherResult
}
external interface CustomMatcherResult {
    var pass: Boolean
    var message: dynamic /* String | () -> String */
}
external interface ArrayLike<T> {
    var length: Number
    @nativeGetter
    operator fun get(n: Number): T?
    @nativeSetter
    operator fun set(n: Number, value: T)
}
