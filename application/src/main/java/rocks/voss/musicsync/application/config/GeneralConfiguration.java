package rocks.voss.musicsync.application.config;

import lombok.Data;

@Data
public class GeneralConfiguration {
    int timeout;
    boolean bulk = false;
    int sortMode;
}
