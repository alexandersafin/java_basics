package service;

import entity.Course;

import java.util.List;

public class CourseService extends BaseService<Course> {
    public CourseService(Class<Course> clazz) {
        super(clazz);
    }

    @Override
    public void add(Course entity) {
        super.add(entity);
    }

    @Override
    public List<Course> getAll() {
        return super.getAll();
    }

    @Override
    public Course getById(Integer id) {
        return super.getById(id);
    }

    @Override
    public void update(Course entity) {
        super.update(entity);
    }

    @Override
    public void delete(Course entity) {
        super.delete(entity);
    }
}