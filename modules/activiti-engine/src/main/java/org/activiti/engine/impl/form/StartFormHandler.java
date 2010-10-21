/* Licensed under the Apache License, Version 2.0 (the "License");
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

package org.activiti.engine.impl.form;

import java.util.Map;

import org.activiti.engine.form.StartForm;
import org.activiti.engine.impl.repository.DeploymentEntity;
import org.activiti.engine.impl.repository.ProcessDefinitionEntity;
import org.activiti.engine.impl.runtime.ExecutionEntity;
import org.activiti.engine.impl.util.xml.Element;


/**
 * @author Tom Baeyens
 */
public interface StartFormHandler {

  StartForm createStartForm(ProcessDefinitionEntity processDefinition);
  ExecutionEntity submitStartForm(ProcessDefinitionEntity processDefinition, Map<String, Object> properties);
  void parseConfiguration(DeploymentEntity deploymentEntity, Element startEventElement);
}