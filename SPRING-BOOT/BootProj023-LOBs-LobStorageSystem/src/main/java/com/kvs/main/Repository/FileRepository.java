package com.kvs.main.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kvs.main.Entity.FileRecord;

public interface FileRepository extends JpaRepository<FileRecord, Long> {

}
