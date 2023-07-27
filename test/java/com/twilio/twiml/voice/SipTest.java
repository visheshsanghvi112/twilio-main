/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.twiml.voice;

import com.twilio.converter.Promoter;
import com.twilio.http.HttpMethod;
import org.junit.Assert;
import org.junit.Test;

import java.net.URI;
import java.util.List;

/**
 * Test class for {@link Sip}
 */
public class SipTest {
    @Test
    public void testElementWithParams() {
        Sip elem = new Sip.Builder(URI.create("https://example.com"))
            .username("username")
            .password("password")
            .url(URI.create("https://example.com"))
            .method(HttpMethod.GET)
            .statusCallbackEvents(Promoter.listOfOne(Sip.Event.INITIATED))
            .statusCallback(URI.create("https://example.com"))
            .statusCallbackMethod(HttpMethod.GET)
            .machineDetection("machine_detection")
            .amdStatusCallbackMethod(HttpMethod.GET)
            .amdStatusCallback("amd_status_callback")
            .machineDetectionTimeout(1)
            .machineDetectionSpeechThreshold(1)
            .machineDetectionSpeechEndThreshold(1)
            .machineDetectionSilenceTimeout(1)
            .build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Sip amdStatusCallback=\"amd_status_callback\" amdStatusCallbackMethod=\"GET\" machineDetection=\"machine_detection\" machineDetectionSilenceTimeout=\"1\" machineDetectionSpeechEndThreshold=\"1\" machineDetectionSpeechThreshold=\"1\" machineDetectionTimeout=\"1\" method=\"GET\" password=\"password\" statusCallback=\"https://example.com\" statusCallbackEvent=\"initiated\" statusCallbackMethod=\"GET\" url=\"https://example.com\" username=\"username\">https://example.com</Sip>",
            elem.toXml()
        );
    }

    @Test
    public void testXmlAttributesDeserialization() {
        final Sip elem = new Sip.Builder(URI.create("https://example.com"))
            .username("username")
            .password("password")
            .url(URI.create("https://example.com"))
            .method(HttpMethod.GET)
            .statusCallbackEvents(Promoter.listOfOne(Sip.Event.INITIATED))
            .statusCallback(URI.create("https://example.com"))
            .statusCallbackMethod(HttpMethod.GET)
            .machineDetection("machine_detection")
            .amdStatusCallbackMethod(HttpMethod.GET)
            .amdStatusCallback("amd_status_callback")
            .machineDetectionTimeout(1)
            .machineDetectionSpeechThreshold(1)
            .machineDetectionSpeechEndThreshold(1)
            .machineDetectionSilenceTimeout(1)
            .build();

        Assert.assertEquals(
            Sip.Builder.fromXml("<Sip amdStatusCallback=\"amd_status_callback\" amdStatusCallbackMethod=\"GET\" machineDetection=\"machine_detection\" machineDetectionSilenceTimeout=\"1\" machineDetectionSpeechEndThreshold=\"1\" machineDetectionSpeechThreshold=\"1\" machineDetectionTimeout=\"1\" method=\"GET\" password=\"password\" statusCallback=\"https://example.com\" statusCallbackEvent=\"initiated\" statusCallbackMethod=\"GET\" url=\"https://example.com\" username=\"username\">https://example.com</Sip>").build().toXml(),
            elem.toXml()
        );
    }
}