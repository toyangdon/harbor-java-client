/*
 * Harbor API
 * These APIs provide services for manipulating Harbor project.
 *
 * OpenAPI spec version: 1.10.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.IsDefault;
import io.swagger.client.model.ProjectScanner;
import io.swagger.client.model.ScannerAdapterMetadata;
import io.swagger.client.model.ScannerRegistration;
import io.swagger.client.model.ScannerRegistrationReq;
import io.swagger.client.model.ScannerRegistrationSettings;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ScannersApi
 */
@Ignore
public class ScannersApiTest {

    private final ScannersApi api = new ScannersApi();

    
    /**
     * Get scanner registration candidates for configurating project level scanner
     *
     * Retrieve the system configured scanner registrations as candidates of setting project level scanner. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void projectsProjectIdScannerCandidatesGetTest() throws ApiException {
        Long projectId = null;
        List<ScannerRegistration> response = api.projectsProjectIdScannerCandidatesGet(projectId);

        // TODO: test validations
    }
    
    /**
     * Get project level scanner
     *
     * Get the scanner registration of the specified project. If no scanner registration is configured for the specified project, the system default scanner registration will be returned.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void projectsProjectIdScannerGetTest() throws ApiException {
        Long projectId = null;
        ScannerRegistration response = api.projectsProjectIdScannerGet(projectId);

        // TODO: test validations
    }
    
    /**
     * Configure scanner for the specified project
     *
     * Set one of the system configured scanner registration as the indepndent scanner of the specified project.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void projectsProjectIdScannerPutTest() throws ApiException {
        Long projectId = null;
        ProjectScanner payload = null;
        api.projectsProjectIdScannerPut(projectId, payload);

        // TODO: test validations
    }
    
    /**
     * List scanner registrations
     *
     * Returns a list of currently configured scanner registrations. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void scannersGetTest() throws ApiException {
        List<ScannerRegistration> response = api.scannersGet();

        // TODO: test validations
    }
    
    /**
     * Tests scanner registration settings
     *
     * Pings scanner adapter to test endpoint URL and authorization settings. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void scannersPingPostTest() throws ApiException {
        ScannerRegistrationSettings settings = null;
        api.scannersPingPost(settings);

        // TODO: test validations
    }
    
    /**
     * Create a scanner registration
     *
     * Creats a new scanner registration with the given data. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void scannersPostTest() throws ApiException {
        ScannerRegistrationReq registration = null;
        api.scannersPost(registration);

        // TODO: test validations
    }
    
    /**
     * Delete a scanner registration
     *
     * Deletes the specified scanner registration. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void scannersRegistrationIdDeleteTest() throws ApiException {
        String registrationId = null;
        ScannerRegistration response = api.scannersRegistrationIdDelete(registrationId);

        // TODO: test validations
    }
    
    /**
     * Get a scanner registration details
     *
     * Retruns the details of the specified scanner registration. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void scannersRegistrationIdGetTest() throws ApiException {
        String registrationId = null;
        ScannerRegistration response = api.scannersRegistrationIdGet(registrationId);

        // TODO: test validations
    }
    
    /**
     * Get the metadata of the specified scanner registration
     *
     * Get the metadata of the specified scanner registration, including the capabilities and customzied properties. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void scannersRegistrationIdMetadataGetTest() throws ApiException {
        String registrationId = null;
        ScannerAdapterMetadata response = api.scannersRegistrationIdMetadataGet(registrationId);

        // TODO: test validations
    }
    
    /**
     * Set system default scanner registration
     *
     * Set the specified scanner registration as the system default one. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void scannersRegistrationIdPatchTest() throws ApiException {
        String registrationId = null;
        IsDefault payload = null;
        api.scannersRegistrationIdPatch(registrationId, payload);

        // TODO: test validations
    }
    
    /**
     * Update a scanner registration
     *
     * Updates the specified scanner registration. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void scannersRegistrationIdPutTest() throws ApiException {
        String registrationId = null;
        ScannerRegistrationReq registration = null;
        api.scannersRegistrationIdPut(registrationId, registration);

        // TODO: test validations
    }
    
}