/*
 * This file is generated by jOOQ.
*/
package com.oneops.crawler.jooq.cms.routines;


import com.oneops.crawler.jooq.cms.Kloopzcm;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DjCreateRelease2 extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1846207778;

    /**
     * The parameter <code>kloopzcm.dj_create_release.p_release_id</code>.
     */
    public static final Parameter<Long> P_RELEASE_ID = createParameter("p_release_id", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>kloopzcm.dj_create_release.p_ns_id</code>.
     */
    public static final Parameter<Long> P_NS_ID = createParameter("p_ns_id", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>kloopzcm.dj_create_release.p_parent_release_id</code>.
     */
    public static final Parameter<Long> P_PARENT_RELEASE_ID = createParameter("p_parent_release_id", org.jooq.impl.SQLDataType.BIGINT, false, false);

    /**
     * The parameter <code>kloopzcm.dj_create_release.p_release_name</code>.
     */
    public static final Parameter<String> P_RELEASE_NAME = createParameter("p_release_name", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * The parameter <code>kloopzcm.dj_create_release.p_created_by</code>.
     */
    public static final Parameter<String> P_CREATED_BY = createParameter("p_created_by", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * The parameter <code>kloopzcm.dj_create_release.p_release_state_id</code>.
     */
    public static final Parameter<Integer> P_RELEASE_STATE_ID = createParameter("p_release_state_id", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>kloopzcm.dj_create_release.p_release_type</code>.
     */
    public static final Parameter<String> P_RELEASE_TYPE = createParameter("p_release_type", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * The parameter <code>kloopzcm.dj_create_release.p_description</code>.
     */
    public static final Parameter<String> P_DESCRIPTION = createParameter("p_description", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * The parameter <code>kloopzcm.dj_create_release.p_revision</code>.
     */
    public static final Parameter<Integer> P_REVISION = createParameter("p_revision", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * Create a new routine call instance
     */
    public DjCreateRelease2() {
        super("dj_create_release", Kloopzcm.KLOOPZCM);

        addInParameter(P_RELEASE_ID);
        addInParameter(P_NS_ID);
        addInParameter(P_PARENT_RELEASE_ID);
        addInParameter(P_RELEASE_NAME);
        addInParameter(P_CREATED_BY);
        addInParameter(P_RELEASE_STATE_ID);
        addInParameter(P_RELEASE_TYPE);
        addInParameter(P_DESCRIPTION);
        addInParameter(P_REVISION);
        setOverloaded(true);
    }

    /**
     * Set the <code>p_release_id</code> parameter IN value to the routine
     */
    public void setPReleaseId(Long value) {
        setValue(P_RELEASE_ID, value);
    }

    /**
     * Set the <code>p_ns_id</code> parameter IN value to the routine
     */
    public void setPNsId(Long value) {
        setValue(P_NS_ID, value);
    }

    /**
     * Set the <code>p_parent_release_id</code> parameter IN value to the routine
     */
    public void setPParentReleaseId(Long value) {
        setValue(P_PARENT_RELEASE_ID, value);
    }

    /**
     * Set the <code>p_release_name</code> parameter IN value to the routine
     */
    public void setPReleaseName(String value) {
        setValue(P_RELEASE_NAME, value);
    }

    /**
     * Set the <code>p_created_by</code> parameter IN value to the routine
     */
    public void setPCreatedBy(String value) {
        setValue(P_CREATED_BY, value);
    }

    /**
     * Set the <code>p_release_state_id</code> parameter IN value to the routine
     */
    public void setPReleaseStateId(Integer value) {
        setValue(P_RELEASE_STATE_ID, value);
    }

    /**
     * Set the <code>p_release_type</code> parameter IN value to the routine
     */
    public void setPReleaseType(String value) {
        setValue(P_RELEASE_TYPE, value);
    }

    /**
     * Set the <code>p_description</code> parameter IN value to the routine
     */
    public void setPDescription(String value) {
        setValue(P_DESCRIPTION, value);
    }

    /**
     * Set the <code>p_revision</code> parameter IN value to the routine
     */
    public void setPRevision(Integer value) {
        setValue(P_REVISION, value);
    }
}
