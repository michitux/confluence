/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.xwiki.contrib.confluence.parser.xhtml.internal.wikimodel;

import org.xwiki.rendering.wikimodel.xhtml.impl.TagContext;

/**
 * Handles task-list tags using a normal list.
 * <p>
 * Example (ending tags written with backslash instead of normal slash because of checkstyle):
 * <p>
 * {@code
 * <ac:task-list>
 * <ac:task>
 * <ac:task-id>1<\ac:task-id>
 * <ac:task-status>complete<\ac:task-status>
 * <ac:task-body>First task<\ac:task-body>
 * <\ac:task>
 * <ac:task>
 * <ac:task-id>2<\ac:task-id>
 * <ac:task-status>incomplete<\ac:task-status>
 * <ac:task-body>Second task<\ac:task-body>
 * <\ac:task>
 * <\ac:task-list>
 * }
 *
 * @version $Id$
 * @since 9.5
 */
public class TaskListTagHandler extends AbstractConfluenceTagHandler implements ConfluenceTagHandler
{
    /**
     * Constructor (checkstyle complains that this comment is missing although the other classes don't have it).
     */
    public TaskListTagHandler()
    {
        super(false);
    }

    @Override
    protected void begin(TagContext context)
    {
    }

    @Override
    protected void end(TagContext context)
    {
    }
}
