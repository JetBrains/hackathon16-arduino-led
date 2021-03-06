/*
 * Copyright (C) 2014 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.zeckson.ledequalizer

/**
 * Defines several constants used between [BluetoothService] and the UI.
 */
interface Constants {
    companion object {

        // Message types sent from the BluetoothService Handler
        val DEVICE_SELECTED = 1
        val MESSAGE_TOAST = 2

        // Key names received from the BluetoothService Handler
        val DEVICE_NAME = "device_name"
        val TOAST = "toast"
    }

}
