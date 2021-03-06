/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2012, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
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
package builder.smartfrog;

import org.kohsuke.stapler.DataBoundConstructor;

/**
 * Represents an installation object - name of the SmartFrog environment installation
 * and the path where it's located.
 *
 * @author Dominik Pospisil
 * @author <a href="http://www.radoslavhusar.com/">Radoslav Husar</a>
 * @author vjuranek
 */
public class SmartFrogInstance {

   private static final String SUPPORT_SCRIPT = "/hudson-support.sf"; 
    
   private String name;
   private String path;
   private String support;

   @DataBoundConstructor
   public SmartFrogInstance(String name, String path, String support) {
      this.name = name;
      this.path = path;
      this.support = support;
   }

   public String getName() {
      return name;
   }

   public String getPath() {
      return path;
   }

   /**
    * @return path to support files needed for SmartFrog (sf, jar, sh).
    */
   public String getSupport() {
      return support;
   }

   public String getSupportScriptPath() {
       return getSupport() + SUPPORT_SCRIPT;
   }
   
}
