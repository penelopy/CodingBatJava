package com.company;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class ArtistTest {
    @Test
    public void artistNameIsEqual() {

        assertThat(new Artist("bob"), equalTo(new Artist("bob")));
    }
}
