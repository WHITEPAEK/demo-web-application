package com.tistory.whitepaek.settings.form;

import lombok.Data;

@Data
public class Notifications {

    private boolean studyCreatedByEmail;

    private boolean studyCreatedByWeb;

    private boolean studyUpdatedByEmail;

    private boolean studyUpdatedByWeb;

    private boolean studyEnrollmentResultByEmail;

    private boolean studyEnrollmentResultByWeb;

}
