/*
 * Copyright 2012-2018 the original author or authors.
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

package io.suricate.monitoring.model.dto;

import io.suricate.monitoring.model.dto.widget.CategoryDto;
import io.suricate.monitoring.model.enums.ConfigurationDataType;
import lombok.*;

/**
 * Configuration used for communication with the clients via webservices
 */
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString
public class ConfigurationDto extends AbstractDto {

    /**
     * The configuration key
     */
    private String key;

    /**
     * The configuration value
     */
    private String value;

    /**
     * Export
     */
    private boolean export;

    /**
     * The data type of the configuration
     */
    private ConfigurationDataType dataType;

    /**
     * Make a link between category and configurations
     */
    private CategoryDto category;
}
