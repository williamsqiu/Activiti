/*
 * Copyright 2018 Alfresco, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.activiti.engine.impl.cmd.integration;

import org.activiti.engine.impl.interceptor.Command;
import org.activiti.engine.impl.interceptor.CommandContext;
import org.activiti.engine.impl.persistence.entity.integration.IntegrationContextEntity;

import java.util.List;

public class RetrieveIntegrationContextsCmd implements Command<List<IntegrationContextEntity>> {

    private String executionId;

    public RetrieveIntegrationContextsCmd(String executionId) {
        this.executionId = executionId;
    }

    @Override
    public List<IntegrationContextEntity> execute(CommandContext commandContext) {
        return commandContext.getProcessEngineConfiguration().getIntegrationContextManager().findIntegrationContextByExecutionId(executionId);
    }
}
