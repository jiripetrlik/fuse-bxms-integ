package org.jboss.integration.fuse.karaf.itest.kiecamel.proxy;

import org.jboss.integration.fuse.karaf.itest.kiecamel.module.model.Person;

/**
 * Created by jpetrlik on 11/11/15.
 */
public interface AgeVerificationServiceGav {
    Person verifyAge(Person person);
}
