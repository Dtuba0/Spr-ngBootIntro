package com.tpe.repository;

import com.tpe.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping//opsiyonel : kullanabılırız kullanmayabılırız de
public interface StudentRepository extends JpaRepository<Student,Long> {

//e hocam implement gerçeleştirmedik?
//çunku JpaRepository deki methodlar otomatik olarak spring tarafından implement ediliyor!!!!




}
