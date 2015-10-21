/*
 * Copyright 2015 Dipu.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.sandsoft.acefx.model;

import com.sandsoft.acefx.AceEditor;
import javafx.event.Event;
import javafx.event.EventType;

/**
 *
 * @author Dipu
 */
public class AceEventProcessor {
        
    //object which event to be fired
    private final AceEditor mAceEditor;

    /**
     * Creates a new event processor for ace editor session.
     * @param ace AceEditor which event to be fired.
     */
    public AceEventProcessor(final AceEditor ace) {
        mAceEditor = ace;
    }

    //
    // Event type declarations
    //
    //Editor event types
    public static final EventType<? extends Event> onBlurEvent = new EventType<>("onBlur");
    public static final EventType<? extends Event> onChangeEvent = new EventType<>("onChange");
    public static final EventType<? extends Event> onChangeSelectionStyleEvent = new EventType<>("onChangeSelectionStyle");
    public static final EventType<? extends Event> onChangeSessionEvent = new EventType<>("onChangeSession");
    public static final EventType<? extends Event> onCopyEvent = new EventType<>("onCopy");
    public static final EventType<? extends Event> onFocusEvent = new EventType<>("onFocus");
    public static final EventType<? extends Event> onPasteEvent = new EventType<>("onPaste");
    
    //Edit Session event types
    public static final EventType<? extends Event> onChangAnnotationEvent = new EventType<>("onChangAnnotation");
    public static final EventType<? extends Event> onChangeBackMarkerEvent = new EventType<>("onChangeBackMarker");
    public static final EventType<? extends Event> onChangeBreakpointEvent = new EventType<>("onChangeBreakpoint");
    public static final EventType<? extends Event> onChangeFoldEvent = new EventType<>("onChangeFold");
    public static final EventType<? extends Event> onChangeFrontMarkerEvent = new EventType<>("onChangeFrontMarker");
    public static final EventType<? extends Event> onChangeModeEvent = new EventType<>("onChangeMode");
    public static final EventType<? extends Event> onChangeOverwriteEvent = new EventType<>("onChangeOverwrite");
    public static final EventType<? extends Event> onChangeScrollLeftEvent = new EventType<>("onChangeScrollLeft");
    public static final EventType<? extends Event> onChangeScrollTopEvent = new EventType<>("onChangeScrollTop");
    public static final EventType<? extends Event> onChangeTabSizeEvent = new EventType<>("onChangeTabSize");
    public static final EventType<? extends Event> onChangeWrapLimitEvent = new EventType<>("onChangeWrapLimit");
    public static final EventType<? extends Event> onChangeWrapModeEvent = new EventType<>("onChangeWrapMode");
    public static final EventType<? extends Event> onTokenizerUpadateEvent = new EventType<>("onTokenizerUpadate");

    //
    // Editor Events
    //
    public void onBlur() {
        mAceEditor.fireEvent(new Event(AceEventProcessor.onBlurEvent));
    }

    public void onChange(Object data) {
        mAceEditor.fireEvent(new Event(AceEventProcessor.onChangeEvent));
    }

    public void onChangeSelectionStyle(Object data) {
        mAceEditor.fireEvent(new Event(AceEventProcessor.onChangeSelectionStyleEvent));
    }

    public void onChangeSession(Object e) {
        mAceEditor.fireEvent(new Event(AceEventProcessor.onChangeSessionEvent));

    }

    public void onCopy(String text) {
        mAceEditor.fireEvent(new Event(AceEventProcessor.onCopyEvent));
    }

    public void onFocus() {
        mAceEditor.fireEvent(new Event(AceEventProcessor.onFocusEvent));

    }

    public void onPaste(Object e) {
        mAceEditor.fireEvent(new Event(AceEventProcessor.onPasteEvent));

    }

    //
    // Edit Session Events
    //
    public void onChangAnnotation() {
        mAceEditor.fireEvent(new Event(AceEventProcessor.onChangAnnotationEvent));

    }

    public void onChangeBackMarker() {
        mAceEditor.fireEvent(new Event(AceEventProcessor.onChangeBackMarkerEvent));

    }

    public void onChangeBreakpoint() {
        mAceEditor.fireEvent(new Event(AceEventProcessor.onChangeBreakpointEvent));

    }

    public void onChangeFold() {
        mAceEditor.fireEvent(new Event(AceEventProcessor.onChangeFoldEvent));

    }

    public void onChangeFrontMarker() {
        mAceEditor.fireEvent(new Event(AceEventProcessor.onChangeFrontMarkerEvent));

    }

    public void onChangeMode() {
        mAceEditor.fireEvent(new Event(AceEventProcessor.onChangeModeEvent));

    }

    public void onChangeOverwrite() {
        mAceEditor.fireEvent(new Event(AceEventProcessor.onChangeOverwriteEvent));

    }

    public void onChangeScrollLeft(Integer scrollLeft) {
        mAceEditor.fireEvent(new Event(AceEventProcessor.onChangeScrollLeftEvent));

    }

    public void onChangeScrollTop(Integer scrollTop) {
        mAceEditor.fireEvent(new Event(AceEventProcessor.onChangeScrollTopEvent));

    }

    public void onChangeTabSize() {
        mAceEditor.fireEvent(new Event(AceEventProcessor.onChangeTabSizeEvent));

    }

    public void onChangeWrapLimit() {
        mAceEditor.fireEvent(new Event(AceEventProcessor.onChangeWrapLimitEvent));

    }

    public void onChangeWrapMode() {
        mAceEditor.fireEvent(new Event(AceEventProcessor.onChangeWrapModeEvent));
    }

    public void onTokenizerUpadate(Object e) {
        mAceEditor.fireEvent(new Event(AceEventProcessor.onTokenizerUpadateEvent));

    }
}
