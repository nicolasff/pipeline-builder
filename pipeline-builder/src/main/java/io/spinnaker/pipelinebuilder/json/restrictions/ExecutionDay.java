/*
 * Copyright 2023 Apple, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.spinnaker.pipelinebuilder.json.restrictions;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ExecutionDay {
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7),
    ;
    private final int dayOfWeek;

    ExecutionDay(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    @JsonValue
    public int getDayOfWeek() {
        return dayOfWeek;
    }
}
