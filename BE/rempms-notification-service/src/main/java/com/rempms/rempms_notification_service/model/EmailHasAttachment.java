package com.rempms.rempms_notification_service.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@Table(name = "email_has_attachment")
public class EmailHasAttachment {
    @Id
    private Integer id;

    private String originalFileName;

    private String attachmentBase64;

    private String contentType;

    private Integer emailLogId;
}
