package org.acme.adapter.domain;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlRootElement(name = "data")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class XmlModel {
    @XmlElement(name = "message")
    private String message;
}
