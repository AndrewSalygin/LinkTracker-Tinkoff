/*
 * This file is generated by jOOQ.
 */

package edu.java.domain.jooq.tables.records;

import edu.java.domain.jooq.tables.Link;
import java.beans.ConstructorProperties;
import java.time.OffsetDateTime;
import javax.annotation.processing.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "https://www.jooq.org",
        "jOOQ version:3.18.9"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class LinkRecord extends UpdatableRecordImpl<LinkRecord> implements Record5<Long, String, OffsetDateTime, OffsetDateTime, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.link.link_id</code>.
     */
    public void setLinkId(@Nullable Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>public.link.link_id</code>.
     */
    @Nullable
    public Long getLinkId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>public.link.url</code>.
     */
    public void setUrl(@NotNull String value) {
        set(1, value);
    }

    /**
     * Getter for <code>public.link.url</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public String getUrl() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.link.last_update</code>.
     */
    public void setLastUpdate(@NotNull OffsetDateTime value) {
        set(2, value);
    }

    /**
     * Getter for <code>public.link.last_update</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public OffsetDateTime getLastUpdate() {
        return (OffsetDateTime) get(2);
    }

    /**
     * Setter for <code>public.link.last_check</code>.
     */
    public void setLastCheck(@NotNull OffsetDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>public.link.last_check</code>.
     */
    @jakarta.validation.constraints.NotNull
    @NotNull
    public OffsetDateTime getLastCheck() {
        return (OffsetDateTime) get(3);
    }

    /**
     * Setter for <code>public.link.meta_info</code>.
     */
    public void setMetaInfo(@Nullable String value) {
        set(4, value);
    }

    /**
     * Getter for <code>public.link.meta_info</code>.
     */
    @Nullable
    public String getMetaInfo() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record5 type implementation
    // -------------------------------------------------------------------------

    @Override
    @NotNull
    public Row5<Long, String, OffsetDateTime, OffsetDateTime, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    @Override
    @NotNull
    public Row5<Long, String, OffsetDateTime, OffsetDateTime, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    @Override
    @NotNull
    public Field<Long> field1() {
        return Link.LINK.LINK_ID;
    }

    @Override
    @NotNull
    public Field<String> field2() {
        return Link.LINK.URL;
    }

    @Override
    @NotNull
    public Field<OffsetDateTime> field3() {
        return Link.LINK.LAST_UPDATE;
    }

    @Override
    @NotNull
    public Field<OffsetDateTime> field4() {
        return Link.LINK.LAST_CHECK;
    }

    @Override
    @NotNull
    public Field<String> field5() {
        return Link.LINK.META_INFO;
    }

    @Override
    @Nullable
    public Long component1() {
        return getLinkId();
    }

    @Override
    @NotNull
    public String component2() {
        return getUrl();
    }

    @Override
    @NotNull
    public OffsetDateTime component3() {
        return getLastUpdate();
    }

    @Override
    @NotNull
    public OffsetDateTime component4() {
        return getLastCheck();
    }

    @Override
    @Nullable
    public String component5() {
        return getMetaInfo();
    }

    @Override
    @Nullable
    public Long value1() {
        return getLinkId();
    }

    @Override
    @NotNull
    public String value2() {
        return getUrl();
    }

    @Override
    @NotNull
    public OffsetDateTime value3() {
        return getLastUpdate();
    }

    @Override
    @NotNull
    public OffsetDateTime value4() {
        return getLastCheck();
    }

    @Override
    @Nullable
    public String value5() {
        return getMetaInfo();
    }

    @Override
    @NotNull
    public LinkRecord value1(@Nullable Long value) {
        setLinkId(value);
        return this;
    }

    @Override
    @NotNull
    public LinkRecord value2(@NotNull String value) {
        setUrl(value);
        return this;
    }

    @Override
    @NotNull
    public LinkRecord value3(@NotNull OffsetDateTime value) {
        setLastUpdate(value);
        return this;
    }

    @Override
    @NotNull
    public LinkRecord value4(@NotNull OffsetDateTime value) {
        setLastCheck(value);
        return this;
    }

    @Override
    @NotNull
    public LinkRecord value5(@Nullable String value) {
        setMetaInfo(value);
        return this;
    }

    @Override
    @NotNull
    public LinkRecord values(@Nullable Long value1, @NotNull String value2, @NotNull OffsetDateTime value3, @NotNull OffsetDateTime value4, @Nullable String value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LinkRecord
     */
    public LinkRecord() {
        super(Link.LINK);
    }

    /**
     * Create a detached, initialised LinkRecord
     */
    @ConstructorProperties({ "linkId", "url", "lastUpdate", "lastCheck", "metaInfo" })
    public LinkRecord(@Nullable Long linkId, @NotNull String url, @NotNull OffsetDateTime lastUpdate, @NotNull OffsetDateTime lastCheck, @Nullable String metaInfo) {
        super(Link.LINK);
        setLinkId(linkId);
        setUrl(url);
        setLastUpdate(lastUpdate);
        setLastCheck(lastCheck);
        setMetaInfo(metaInfo);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised LinkRecord
     */
    public LinkRecord(edu.java.domain.jooq.tables.pojos.Link value) {
        super(Link.LINK);

        if (value != null) {
            setLinkId(value.getLinkId());
            setUrl(value.getUrl());
            setLastUpdate(value.getLastUpdate());
            setLastCheck(value.getLastCheck());
            setMetaInfo(value.getMetaInfo());
            resetChangedOnNotNull();
        }
    }
}
