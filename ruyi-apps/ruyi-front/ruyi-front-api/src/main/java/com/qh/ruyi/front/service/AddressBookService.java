package com.qh.ruyi.front.service;

import com.qh.ruyi.entity.AddressBook;

import java.util.List;

public interface AddressBookService {
    void save(AddressBook addressBook);
    
    void updateByUserId(AddressBook addressBook, String currentId);

    void updateById(AddressBook addressBook);

    AddressBook getById(Long id);

    AddressBook getByCondition(AddressBook addressBook);

    List<AddressBook> list(AddressBook addressBook);
}
