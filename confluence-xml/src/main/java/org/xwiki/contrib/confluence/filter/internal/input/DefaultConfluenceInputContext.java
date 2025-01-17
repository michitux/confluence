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
package org.xwiki.contrib.confluence.filter.internal.input;

import javax.inject.Singleton;

import org.xwiki.component.annotation.Component;
import org.xwiki.contrib.confluence.filter.input.ConfluenceInputContext;
import org.xwiki.contrib.confluence.filter.input.ConfluenceInputProperties;
import org.xwiki.contrib.confluence.filter.input.ConfluenceXMLPackage;

/**
 * Default implementation of {@link ConfluenceInputContext}.
 * 
 * @version $Id$
 * @since 9.7
 */
@Component
@Singleton
public class DefaultConfluenceInputContext implements ConfluenceInputContext
{
    private ThreadLocal<ConfluenceInputProperties> properties = new ThreadLocal<>();

    private ThreadLocal<ConfluenceXMLPackage> confluencePackage = new ThreadLocal<>();

    /**
     * @param confluencePackage the Confluence input package
     * @param properties the Confluence input properties
     */
    public void set(ConfluenceXMLPackage confluencePackage, ConfluenceInputProperties properties)
    {
        this.confluencePackage.set(confluencePackage);
        this.properties.set(properties);
    }

    /**
     * Clean the current context.
     */
    public void remove()
    {
        this.confluencePackage.remove();
        this.properties.remove();
    }

    @Override
    public ConfluenceInputProperties getProperties()
    {
        return this.properties.get();
    }

    @Override
    public ConfluenceXMLPackage getConfluencePackage()
    {
        return this.confluencePackage.get();
    }
}
