/*******************************************************************************
 * Copyright 2012-2014 Esri
 * 
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 *  
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 ******************************************************************************/
package com.esri.militaryapps.model;

/**
 * An enum that distinguishes between various navigation modes.
 */
public enum NavigationMode {
    /**
     * Rotate the map so that north is up.
     */
    NORTH_UP,
    
    /**
     * Rotate the map so that the current heading is up.
     */
    TRACK_UP,
    
    /**
     * Rotate the map so that the direction from the current location to the
     * selected waypoint is up.
     */
    WAYPOINT_UP
}
