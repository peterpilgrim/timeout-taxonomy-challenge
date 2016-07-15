/*******************************************************************************
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2016 by Peter Pilgrim, Milton Keynes, P.E.A.T UK LTD
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Creative Commons 3.0
 * Non Commercial Non Derivation Share-alike License
 * https://creativecommons.org/licenses/by-nc-nd/4.0/
 *
 * Developers:
 * Peter Pilgrim -- design, development and implementation
 *               -- Blog: http://www.xenonique.co.uk/blog/
 *               -- Twitter: @peter_pilgrim
 *
 * Contributors:
 *
 *******************************************************************************/

package uk.co.xenonique.client.timeout

trait Tag {
  val name: String
  val parent: Option[Tag]
}

case class ContentTag( override val name: String, override val parent: Option[Tag] = None ) extends Tag  {
  override def equals(obj: Any): Boolean = {
    obj match {
      case ContentTag( x, y) => name.equals(x)
      case _ => false
    }
  }

  override def hashCode(): Int = {
    if (name != null)
      name.hashCode
    else
      -1
  }
}
