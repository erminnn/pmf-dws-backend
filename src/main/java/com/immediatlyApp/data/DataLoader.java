package com.immediatlyApp.data;

import com.immediatlyApp.repositories.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@RequiredArgsConstructor
public class DataLoader implements InitializingBean {

    private final UserRepository userRepository;
    private final LKPServiceTypeRepository lkpServiceRepository;
    private  final UserOfferedServiceTypeRepository userOfferedServiceTypeRepository;
    private final LKPCityRepository lkpCityRepository;
    private final LKPCountryRepository lkpCountryRepository;
    private final LKPImpressionRepository lkpImpressionRepository;
    private final UserDidServiceTypeRepository userDidServiceTypeRepository;
    private final UserImpressionRepository userImpressionRepository;


    /**
     * Invoked by the containing {@code BeanFactory} after it has set all bean properties
     * and satisfied {@link BeanFactoryAware}, {@code ApplicationContextAware} etc.
     * <p>This method allows the bean instance to perform validation of its overall
     * configuration and final initialization when all bean properties have been set.
     *
     * @throws Exception in the event of misconfiguration (such as failure to set an
     *                   essential property) or if initialization fails for any other reason
     */
    @Override
    @Validated
    public void afterPropertiesSet() throws Exception {

    }
}