package org.jellyfin.androidtv.model.compat;

import mediabrowser.model.dlna.PlaybackErrorCode;

@Deprecated
public class PlaybackException extends RuntimeException {
    private PlaybackErrorCode ErrorCode = PlaybackErrorCode.values()[0];

    public final PlaybackErrorCode getErrorCode() {
        return ErrorCode;
    }

    public final void setErrorCode(PlaybackErrorCode value) {
        ErrorCode = value;
    }
}