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

package io.spinnaker.pipelinebuilder.test;

import io.spinnaker.pipelinebuilder.json.artifacts.InputArtifact;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

/**
 * Tests for the artifact classes.
 */
public class ArtifactTests {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @Test void inputArtifactSerialization() {
        InputArtifact minimalInputArtifact = InputArtifact.builder()
                .id("test")
                .build();

        Assertions.assertEquals(
                objectMapper.convertValue(minimalInputArtifact, Map.class),
                Map.of(
                        "id", "test"
                ));
    }
}
