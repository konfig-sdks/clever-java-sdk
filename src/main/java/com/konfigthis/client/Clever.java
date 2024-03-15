package com.konfigthis.client;

import com.konfigthis.client.api.CoursesApi;
import com.konfigthis.client.api.DistrictsApi;
import com.konfigthis.client.api.ResourcesApi;
import com.konfigthis.client.api.SchoolsApi;
import com.konfigthis.client.api.SectionsApi;
import com.konfigthis.client.api.TermsApi;
import com.konfigthis.client.api.UsersApi;

public class Clever {
    private ApiClient apiClient;
    public final CoursesApi courses;
    public final DistrictsApi districts;
    public final ResourcesApi resources;
    public final SchoolsApi schools;
    public final SectionsApi sections;
    public final TermsApi terms;
    public final UsersApi users;

    public Clever() {
        this(null);
    }

    public Clever(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.courses = new CoursesApi(this.apiClient);
        this.districts = new DistrictsApi(this.apiClient);
        this.resources = new ResourcesApi(this.apiClient);
        this.schools = new SchoolsApi(this.apiClient);
        this.sections = new SectionsApi(this.apiClient);
        this.terms = new TermsApi(this.apiClient);
        this.users = new UsersApi(this.apiClient);
    }

}
