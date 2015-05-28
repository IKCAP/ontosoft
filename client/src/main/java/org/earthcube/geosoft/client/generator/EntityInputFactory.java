package org.earthcube.geosoft.client.generator;


public interface EntityInputFactory {
  public Object instantiate( String className );
  public boolean hasClass( String className );
}