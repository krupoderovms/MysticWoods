@file:JvmName("Lwjgl3Launcher")

package com.github.krupoderovms.mysticwoods.lwjgl3

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration
import com.github.krupoderovms.mysticwoods.MysticWoods

/** Launches the desktop (LWJGL3) application. */
fun main() {
    Lwjgl3Application(MysticWoods(), Lwjgl3ApplicationConfiguration().apply {
        setTitle("MysticWoods")
        setWindowedMode(640, 480)
        setWindowIcon(*(arrayOf(128, 64, 32, 16).map { "libgdx$it.png" }.toTypedArray()))
    })
}
