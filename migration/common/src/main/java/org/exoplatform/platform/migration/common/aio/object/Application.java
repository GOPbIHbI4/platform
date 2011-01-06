/*
 * Copyright (C) 2003-2007 eXo Platform SAS.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Affero General Public License
 * as published by the Free Software Foundation; either version 3
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, see<http://www.gnu.org/licenses/>.
 */
package org.exoplatform.platform.migration.common.aio.object;

import org.exoplatform.portal.config.model.Properties;

public class Application {

  private String id;
  private String instanceId;
  private String applicationType = org.exoplatform.web.application.Application.EXO_PORTLET_TYPE;
  private String title;

  private String icon;
  private String description;

  private boolean showInfoBar = false;
  private boolean showApplicationState = false;
  private boolean showApplicationMode = false;
  private String theme;
  private String width;
  private String height;
  private Properties properties;

  public Application() {}

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getInstanceId() {
    return instanceId;
  }

  public void setInstanceId(String instanceId) {
    this.instanceId = instanceId;
  }

  public String getApplicationType() {
    return applicationType;
  }

  public void setApplicationType(String applicationType) {
    this.applicationType = applicationType;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public boolean isShowInfoBar() {
    return showInfoBar;
  }

  public void setShowInfoBar(boolean showInfoBar) {
    this.showInfoBar = showInfoBar;
  }

  public boolean isShowApplicationState() {
    return showApplicationState;
  }

  public void setShowApplicationState(boolean showApplicationState) {
    this.showApplicationState = showApplicationState;
  }

  public boolean isShowApplicationMode() {
    return showApplicationMode;
  }

  public void setShowApplicationMode(boolean showApplicationMode) {
    this.showApplicationMode = showApplicationMode;
  }

  public String getTheme() {
    return theme;
  }

  public void setTheme(String theme) {
    this.theme = theme;
  }

  public String getWidth() {
    return width;
  }

  public void setWidth(String width) {
    this.width = width;
  }

  public String getHeight() {
    return height;
  }

  public void setHeight(String height) {
    this.height = height;
  }

  public Properties getProperties() {
    return properties;
  }

  public void setProperties(Properties properties) {
    this.properties = properties;
  }

}