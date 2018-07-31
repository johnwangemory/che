/*
 * Copyright (c) 2012-2018 Red Hat, Inc.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which is available at http://www.eclipse.org/legal/epl-2.0.html
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package org.eclipse.che.plugin.testing.ide.messages;

/** Data class represents test suite ended message. */
public class SuiteTreeEnded extends BaseTestSuiteMessage {

  SuiteTreeEnded() {}

  @Override
  public void visit(TestingMessageVisitor visitor) {
    visitor.visitSuiteTreeEnded(this);
  }
}