/*******************************************************************************
 * Copyright (c) 2011 SunGard CSA LLC and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    SunGard CSA LLC - initial API and implementation and/or initial documentation
 *******************************************************************************/
package restDocumentation;

/**
 * @author Yogesh.Manware
 * 
 */
public class StringUtils
{

   /**
    * @param source
    * @param separator
    * @return
    */
   public static final String substringAfterLast(String source, String separator)
   {
      if (isEmpty(source))
      {
         return source;
      }
      if (isEmpty(separator))
      {
         return "";
      }
      int pos = source.lastIndexOf(separator);
      if (pos == -1 || pos == (source.length() - separator.length()))
      {
         return "";
      }
      return source.substring(pos + separator.length());
   }

   public static boolean isEmpty(String string)
   {
      return (null == string) || (0 == string.length());
   }

   /**
    * @param source
    * @param separator
    * @return
    */
   public static String substringBeforeLast(String source, String separator)
   {
      if (isEmpty(source) || isEmpty(separator))
      {
         return source;
      }
      int pos = source.lastIndexOf(separator);
      if (pos == -1)
      {
         return source;
      }
      return source.substring(0, pos);
   }

   /**
    * Wraps the string and appends with ...
    * 
    * 
    * @param inStr
    * @param length
    * @return
    */
   public static String wrapString(String inStr, int length)
   {
      String wrappedStr = inStr;
      if (inStr.length() > length)
      {
         wrappedStr = inStr.substring(0, length) + "...";
      }
      return wrappedStr;
   }
}