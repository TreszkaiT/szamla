package com.tresz.szamla.beans.components;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
@ConfigurationProperties(prefix = "product")
public class ProductProperty {

    private String title;
    private Double version;

    public ProductProperty() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getVersion() {
        return version;
    }

    public void setVersion(Double version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Property{" +
                "title='" + title + '\'' +
                ", version=" + version +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductProperty productProperty = (ProductProperty) o;
        return Objects.equals(title, productProperty.title) && Objects.equals(version, productProperty.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, version);
    }
}
