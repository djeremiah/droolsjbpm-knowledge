/*
 * Copyright 2010 JBoss Inc
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

package org.kie.api.event.rule;

import java.util.Collection;

/**
 * @deprecated This will be removed in drools 6.1
 * Use <code>RuleRuntimeEventManager</code>
 */
public interface WorkingMemoryEventManager {

    /**
     * Add an event listener.
     * 
     * @param listener
     *            The listener to add.
     */
    public void addEventListener(WorkingMemoryEventListener listener);

    /**
     * Remove an event listener.
     * 
     * @param listener
     *            The listener to remove.
     */
    public void removeEventListener(WorkingMemoryEventListener listener);

    /**
     * Returns all event listeners.
     * 
     * @return listeners The listeners.
     */
    public Collection<WorkingMemoryEventListener> getWorkingMemoryEventListeners();

    /**
     * Add an event listener.
     * 
     * @param listener
     *            The listener to add.
     */
    public void addEventListener(AgendaEventListener listener);

    /**
     * Remove an event listener.
     * 
     * @param listener
     *            The listener to remove.
     */
    public void removeEventListener(AgendaEventListener listener);

    /**
     * Returns all event listeners.
     * 
     * @return listeners The listeners.
     */
    public Collection<AgendaEventListener> getAgendaEventListeners();

}