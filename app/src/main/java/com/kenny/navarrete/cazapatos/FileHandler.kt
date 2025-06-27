package com.kenny.navarrete.cazapatos

interface FileHandler {
    fun SaveInformation (datosAGrabar: Pair<String, String>)
    fun ReadInformation():Pair<String,String>
}