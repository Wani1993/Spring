package kr.co.greenart.config;

import javax.servlet.Filter;


import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer{
//root-context 역활 대체 (삭제해도됨)
   @Override
   protected Class<?>[] getRootConfigClasses() {
      return new Class[] {RootConfig.class};
      //루트콘피그 배열 넘겨주기
   }

   @Override
   protected Class<?>[] getServletConfigClasses() {
      return new Class[] {WebConfig.class};
   }

   @Override
   protected String[] getServletMappings() {
      return new String[] {"/"};
   }

   //encoding 설정
   @Override
   protected Filter[] getServletFilters() {
      CharacterEncodingFilter encodingFilter = new CharacterEncodingFilter();
      encodingFilter.setEncoding("UTF-8");
      encodingFilter.setForceEncoding(true);
      return new Filter[] {encodingFilter};
   }

}