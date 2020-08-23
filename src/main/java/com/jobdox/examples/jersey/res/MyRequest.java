package com.jobdox.examples.jersey.res;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Objects;

@XmlRootElement
public class MyRequest {

    String prop1;
    Integer prop2;

    /*
    public MyRequest() {
    }

    public MyRequest(String prop1, Integer prop2) {
        this.prop1 = prop1;
        this.prop2 = prop2;
    }
     */

    public String getProp1() {
        return prop1;
    }

    public void setProp1(String prop1) {
        this.prop1 = prop1;
    }

    public Integer getProp2() {
        return prop2;
    }

    public void setProp2(Integer prop2) {
        this.prop2 = prop2;
    }

    @Override
    public String toString() {
        return "MyRequest{" +
                "prop1='" + prop1 + '\'' +
                ", prop2=" + prop2 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyRequest myRequest = (MyRequest) o;
        return Objects.equals(prop1, myRequest.prop1) &&
                Objects.equals(prop2, myRequest.prop2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prop1, prop2);
    }
}
