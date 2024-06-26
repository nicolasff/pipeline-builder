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

package io.spinnaker.pipelinebuilder.json.triggers;

import com.fasterxml.jackson.annotation.JsonValue;

/** Various different statuses a pipeline can report when ending. */
public enum PipelineStatus {
    SUCCESSFUL("successful"),
    FAILED("failed"),
    CANCELED("canceled"),
    ;

    private final String jsonValue;

    PipelineStatus(String jsonValue) {
        this.jsonValue = jsonValue;
    }

    @JsonValue
    public String getJsonValue() {
        return jsonValue;
    }
}
