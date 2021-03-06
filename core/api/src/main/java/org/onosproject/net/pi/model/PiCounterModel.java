/*
 * Copyright 2017-present Open Networking Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.onosproject.net.pi.model;

import com.google.common.annotations.Beta;

/**
 * Model of a counter in protocol-independent pipeline.
 */
@Beta
public interface PiCounterModel {

    /**
     * Counter unit.
     */
    enum Unit {
        /**
         * Counts only bytes.
         */
        BYTES,
        /**
         * Counts only packets.
         */
        PACKETS,
        /**
         * Counts both packets and bytes.
         */
        PACKETS_AND_BYTES
    }

    /**
     * Returns the ID of this counter.
     *
     * @return counter ID
     */
    PiCounterId id();

    /**
     * Returns the type of counter.
     *
     * @return counter type
     */
    PiCounterType counterType();

    /**
     * Returns the unit of this counter.
     *
     * @return counter unit
     */
    Unit unit();

    /**
     * Returns the table ID associated with this counter. Meaningful only if the counter type is {@link
     * PiCounterType#DIRECT}.
     *
     * @return table model
     */
    PiTableId table();

    /**
     * Returns the number of cells of this counter. Meaningful only if the counter type is {@link
     * PiCounterType#INDIRECT}.
     *
     * @return size
     */
    long size();
}
