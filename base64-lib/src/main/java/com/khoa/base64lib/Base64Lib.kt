package com.khoa.base64lib

import android.util.Base64

class Base64Lib {
    companion object {
        fun encode(value: String): String {
            return Base64.encodeToString(value.toByteArray(), Base64.NO_WRAP)
        }

        fun decode(value: String): ByteArray {
            return Base64.decode(value, Base64.NO_WRAP)
        }
    }
}

val String.base64
    get() = Base64Lib.encode(this)