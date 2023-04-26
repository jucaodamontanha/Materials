package com.materiais.materiais.service;

import com.materiais.materiais.models.Funcionario;
import com.materiais.materiais.models.Material;
import com.materiais.materiais.repository.FuncionarioRepository;
import com.materiais.materiais.repository.MaterialRepository;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class MaterialService {

    FuncionarioRepository funcionario = new FuncionarioRepository() {
        @Override
        public void flush() {

        }

        MaterialRepository material = new MaterialRepository() {
            @Override
            public void flush() {

            }

            @Override
            public <S extends Material> S saveAndFlush(S entity) {
                return null;
            }

            @Override
            public <S extends Material> List<S> saveAllAndFlush(Iterable<S> entities) {
                return null;
            }

            @Override
            public void deleteAllInBatch(Iterable<Material> entities) {

            }

            @Override
            public void deleteAllByIdInBatch(Iterable<Integer> integers) {

            }

            @Override
            public void deleteAllInBatch() {

            }

            @Override
            public Material getOne(Integer integer) {
                return null;
            }

            @Override
            public Material getById(Integer integer) {
                return null;
            }

            @Override
            public Material getReferenceById(Integer integer) {
                return null;
            }

            @Override
            public <S extends Material> List<S> findAll(Example<S> example) {
                return null;
            }

            @Override
            public <S extends Material> List<S> findAll(Example<S> example, Sort sort) {
                return null;
            }

            @Override
            public <S extends Material> List<S> saveAll(Iterable<S> entities) {
                return null;
            }

            @Override
            public List<Material> findAll() {
                return null;
            }

            @Override
            public List<Material> findAllById(Iterable<Integer> integers) {
                return null;
            }

            @Override
            public <S extends Material> S save(S entity) {
                return null;
            }

            @Override
            public Optional<Material> findById(Integer integer) {
                return Optional.empty();
            }

            @Override
            public boolean existsById(Integer integer) {
                return false;
            }

            @Override
            public long count() {
                return 0;
            }

            @Override
            public void deleteById(Integer integer) {

            }

            @Override
            public void delete(Material entity) {

            }

            @Override
            public void deleteAllById(Iterable<? extends Integer> integers) {

            }

            @Override
            public void deleteAll(Iterable<? extends Material> entities) {

            }

            @Override
            public void deleteAll() {

            }

            @Override
            public List<Material> findAll(Sort sort) {
                return null;
            }

            @Override
            public Page<Material> findAll(Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Material> Optional<S> findOne(Example<S> example) {
                return Optional.empty();
            }

            @Override
            public <S extends Material> Page<S> findAll(Example<S> example, Pageable pageable) {
                return null;
            }

            @Override
            public <S extends Material> long count(Example<S> example) {
                return 0;
            }

            @Override
            public <S extends Material> boolean exists(Example<S> example) {
                return false;
            }

            @Override
            public <S extends Material, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
                return null;
            }
        };

        @Override
        public <S extends Funcionario> S saveAndFlush(S entity) {
            return null;
        }

        @Override
        public <S extends Funcionario> List<S> saveAllAndFlush(Iterable<S> entities) {
            return null;
        }

        @Override
        public void deleteAllInBatch(Iterable<Funcionario> entities) {

        }

        @Override
        public void deleteAllByIdInBatch(Iterable<Integer> integers) {

        }

        @Override
        public void deleteAllInBatch() {

        }

        @Override
        public Funcionario getOne(Integer integer) {
            return null;
        }

        @Override
        public Funcionario getById(Integer integer) {
            return null;
        }

        @Override
        public Funcionario getReferenceById(Integer integer) {
            return null;
        }

        @Override
        public <S extends Funcionario> List<S> findAll(Example<S> example) {
            return null;
        }

        @Override
        public <S extends Funcionario> List<S> findAll(Example<S> example, Sort sort) {
            return null;
        }

        @Override
        public <S extends Funcionario> List<S> saveAll(Iterable<S> entities) {
            return null;
        }

        @Override
        public List<Funcionario> findAll() {
            return null;
        }

        @Override
        public List<Funcionario> findAllById(Iterable<Integer> integers) {
            return null;
        }

        @Override
        public <S extends Funcionario> S save(S entity) {
            return null;
        }

        @Override
        public Optional<Funcionario> findById(Integer integer) {
            return Optional.empty();
        }

        @Override
        public boolean existsById(Integer integer) {
            return false;
        }

        @Override
        public long count() {
            return 0;
        }

        @Override
        public void deleteById(Integer integer) {

        }

        @Override
        public void delete(Funcionario entity) {

        }

        @Override
        public void deleteAllById(Iterable<? extends Integer> integers) {

        }

        @Override
        public void deleteAll(Iterable<? extends Funcionario> entities) {

        }

        @Override
        public void deleteAll() {

        }

        @Override
        public List<Funcionario> findAll(Sort sort) {
            return null;
        }

        @Override
        public Page<Funcionario> findAll(Pageable pageable) {
            return null;
        }

        @Override
        public <S extends Funcionario> Optional<S> findOne(Example<S> example) {
            return Optional.empty();
        }

        @Override
        public <S extends Funcionario> Page<S> findAll(Example<S> example, Pageable pageable) {
            return null;
        }

        @Override
        public <S extends Funcionario> long count(Example<S> example) {
            return 0;
        }

        @Override
        public <S extends Funcionario> boolean exists(Example<S> example) {
            return false;
        }

        @Override
        public <S extends Funcionario, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
            return null;
        }
    };
}
