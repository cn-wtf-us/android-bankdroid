package com.liato.bankdroid.db;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import java.io.IOException;

import static org.junit.Assert.fail;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE)
@Ignore("Test placeholder for documentation")
public class EquitiesTableCreationTest
{


    @Test
    public void equities_table_is_created_when_onCreate_is_called() throws IOException {
        fail();
    }

    @Test
    public void equities_table_is_created_on_db_upgrades_where_old_version_is_12() {
        fail();
    }
}

