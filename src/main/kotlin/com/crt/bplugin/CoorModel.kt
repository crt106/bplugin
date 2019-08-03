package com.crt.bplugin

/**
 * @author chaoruitao
 * @date 2019-07-29
 */
data class CoorModel(var id: Int, var name: String, var coor: Array<Double>) {

    override fun equals(other: Any?): Boolean {
        return super.equals(other)
    }

    override fun hashCode(): Int {
        return super.hashCode()
    }
}
