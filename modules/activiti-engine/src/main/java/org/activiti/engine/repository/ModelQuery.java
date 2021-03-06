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

package org.activiti.engine.repository;

import org.activiti.engine.query.Query;

/**
 * Allows programmatic querying of {@link Model}s.
 * 
 * @author Tijs Rademakers
 */
public interface ModelQuery extends Query<ModelQuery, Model> {
  
  /** Only select model with the given id.  */
  ModelQuery modelId(String modelId);
  
  /** Only select models with the given category. */
  ModelQuery modelCategory(String modelCategory);
  
  /**
   * Only select models where the category matches the given parameter.
   * The syntax that should be used is the same as in SQL, eg. %activiti%
   */
  ModelQuery modelCategoryLike(String modelCategoryLike);

  /** Only select models that have a different category then the given one. */
  ModelQuery modelCategoryNotEquals(String categoryNotEquals);

  /** Only select models with the given name. */
  ModelQuery modelName(String modelName);
  
  /**
   * Only select models where the name matches the given parameter.
   * The syntax that should be used is the same as in SQL, eg. %activiti%
   */
  ModelQuery modelNameLike(String modelNameLike);

  /**
   * Only select model with a certain version.
   */
  ModelQuery modelVersion(Integer modelVersion);

  // ordering ////////////////////////////////////////////////////////////
  
  /** Order by the category of the models (needs to be followed by {@link #asc()} or {@link #desc()}). */
  ModelQuery orderByModelCategory();

  /** Order by the id of the models (needs to be followed by {@link #asc()} or {@link #desc()}). */
  ModelQuery orderByModelId();
  
  /** Order by the version of the models (needs to be followed by {@link #asc()} or {@link #desc()}). */
  ModelQuery orderByModelVersion();
  
  /** Order by the name of the models (needs to be followed by {@link #asc()} or {@link #desc()}). */
  ModelQuery orderByModelName();
  
}
