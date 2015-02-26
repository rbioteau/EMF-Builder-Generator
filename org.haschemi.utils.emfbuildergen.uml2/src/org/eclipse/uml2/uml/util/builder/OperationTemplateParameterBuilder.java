package org.eclipse.uml2.uml.util.builder;

/**
 * <!-- begin-user-doc --> 
 *   A builder for the model object ' <em><b>org.eclipse.uml2.uml.OperationTemplateParameter</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class OperationTemplateParameterBuilder implements org.eclipse.uml2.uml.util.builder.IUmlBuilder<org.eclipse.uml2.uml.OperationTemplateParameter> {
  // features and builders
  private org.eclipse.uml2.uml.ParameterableElement m_default_;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ParameterableElement> m_featureDefault_Builder;
  private org.eclipse.uml2.uml.ParameterableElement m_ownedDefault;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ParameterableElement> m_featureOwnedDefaultBuilder;
  private org.eclipse.uml2.uml.ParameterableElement m_ownedParameteredElement;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ParameterableElement> m_featureOwnedParameteredElementBuilder;
  private org.eclipse.uml2.uml.ParameterableElement m_parameteredElement;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ParameterableElement> m_featureParameteredElementBuilder;
  private org.eclipse.uml2.uml.TemplateSignature m_signature;
  private org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateSignature> m_featureSignatureBuilder;
  private java.util.Collection<org.eclipse.emf.ecore.EAnnotation> m_eAnnotations = new java.util.LinkedList<org.eclipse.emf.ecore.EAnnotation>();
  private java.util.Collection<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>> m_featureEAnnotationsBuilder = new java.util.LinkedList<org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation>>();
  private java.util.Collection<org.eclipse.uml2.uml.Comment> m_ownedComment = new java.util.LinkedList<org.eclipse.uml2.uml.Comment>();
  private java.util.Collection<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment>> m_featureOwnedCommentBuilder = new java.util.LinkedList<org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment>>();
  // helper attributes
  private boolean m_featureDefault_Set = false;
  private boolean m_featureEAnnotationsSet = false;
  private boolean m_featureOwnedCommentSet = false;
  private boolean m_featureOwnedDefaultSet = false;
  private boolean m_featureOwnedParameteredElementSet = false;
  private boolean m_featureParameteredElementSet = false;
  private boolean m_featureSignatureSet = false;

  /**
   * Builder is not instantiated with a constructor.
   * @see #newOperationTemplateParameterBuilder()
   */
  private OperationTemplateParameterBuilder() {
  }

  /**
   * This method creates a new instance of the OperationTemplateParameterBuilder.
   * @return new instance of the OperationTemplateParameterBuilder
   */
  public static OperationTemplateParameterBuilder newOperationTemplateParameterBuilder() {
    return new OperationTemplateParameterBuilder();
  }

  /**
   * This method can be used to override attributes of the builder. It constructs a new builder and copies the current values to it.
   */
  public OperationTemplateParameterBuilder but() {
    OperationTemplateParameterBuilder _builder = newOperationTemplateParameterBuilder();
    _builder.m_featureDefault_Set = m_featureDefault_Set;
    _builder.m_default_ = m_default_;
    _builder.m_featureDefault_Builder = m_featureDefault_Builder;
    _builder.m_featureEAnnotationsSet = m_featureEAnnotationsSet;
    _builder.m_eAnnotations = m_eAnnotations;
    _builder.m_featureEAnnotationsBuilder = m_featureEAnnotationsBuilder;
    _builder.m_featureOwnedCommentSet = m_featureOwnedCommentSet;
    _builder.m_ownedComment = m_ownedComment;
    _builder.m_featureOwnedCommentBuilder = m_featureOwnedCommentBuilder;
    _builder.m_featureOwnedDefaultSet = m_featureOwnedDefaultSet;
    _builder.m_ownedDefault = m_ownedDefault;
    _builder.m_featureOwnedDefaultBuilder = m_featureOwnedDefaultBuilder;
    _builder.m_featureOwnedParameteredElementSet = m_featureOwnedParameteredElementSet;
    _builder.m_ownedParameteredElement = m_ownedParameteredElement;
    _builder.m_featureOwnedParameteredElementBuilder = m_featureOwnedParameteredElementBuilder;
    _builder.m_featureParameteredElementSet = m_featureParameteredElementSet;
    _builder.m_parameteredElement = m_parameteredElement;
    _builder.m_featureParameteredElementBuilder = m_featureParameteredElementBuilder;
    _builder.m_featureSignatureSet = m_featureSignatureSet;
    _builder.m_signature = m_signature;
    _builder.m_featureSignatureBuilder = m_featureSignatureBuilder;
    return _builder;
  }

  /**
   * This method constructs the final org.eclipse.uml2.uml.OperationTemplateParameter type.
   * @return new instance of the org.eclipse.uml2.uml.OperationTemplateParameter type
   */
  public org.eclipse.uml2.uml.OperationTemplateParameter build() {
    final org.eclipse.uml2.uml.OperationTemplateParameter _newInstance = org.eclipse.uml2.uml.UMLFactory.eINSTANCE.createOperationTemplateParameter();
    if (m_featureDefault_Set) {
      _newInstance.setDefault(m_default_);
    } else {
      if (m_featureDefault_Builder != null) {
        _newInstance.setDefault(m_featureDefault_Builder.build());
      }
    }
    if (m_featureOwnedDefaultSet) {
      _newInstance.setOwnedDefault(m_ownedDefault);
    } else {
      if (m_featureOwnedDefaultBuilder != null) {
        _newInstance.setOwnedDefault(m_featureOwnedDefaultBuilder.build());
      }
    }
    if (m_featureOwnedParameteredElementSet) {
      _newInstance.setOwnedParameteredElement(m_ownedParameteredElement);
    } else {
      if (m_featureOwnedParameteredElementBuilder != null) {
        _newInstance.setOwnedParameteredElement(m_featureOwnedParameteredElementBuilder.build());
      }
    }
    if (m_featureParameteredElementSet) {
      _newInstance.setParameteredElement(m_parameteredElement);
    } else {
      if (m_featureParameteredElementBuilder != null) {
        _newInstance.setParameteredElement(m_featureParameteredElementBuilder.build());
      }
    }
    if (m_featureSignatureSet) {
      _newInstance.setSignature(m_signature);
    } else {
      if (m_featureSignatureBuilder != null) {
        _newInstance.setSignature(m_featureSignatureBuilder.build());
      }
    }
    if (m_featureEAnnotationsSet) {
      _newInstance.getEAnnotations().addAll(m_eAnnotations);
    } else {
      if (!m_featureEAnnotationsBuilder.isEmpty()) {
        for (org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation> builder : m_featureEAnnotationsBuilder) {
          _newInstance.getEAnnotations().add(builder.build());
        }
      }
    }
    if (m_featureOwnedCommentSet) {
      _newInstance.getOwnedComments().addAll(m_ownedComment);
    } else {
      if (!m_featureOwnedCommentBuilder.isEmpty()) {
        for (org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment> builder : m_featureOwnedCommentBuilder) {
          _newInstance.getOwnedComments().add(builder.build());
        }
      }
    }
    return _newInstance;
  }

  public OperationTemplateParameterBuilder withDefault_(org.eclipse.uml2.uml.ParameterableElement p_default_) {
    m_default_ = p_default_;
    m_featureDefault_Set = true;
    return this;
  }

  public OperationTemplateParameterBuilder withDefault_(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ParameterableElement> p_parameterableElementBuilder) {
    m_featureDefault_Builder = p_parameterableElementBuilder;
    return this;
  }

  public OperationTemplateParameterBuilder withOwnedDefault(org.eclipse.uml2.uml.ParameterableElement p_ownedDefault) {
    m_ownedDefault = p_ownedDefault;
    m_featureOwnedDefaultSet = true;
    return this;
  }

  public OperationTemplateParameterBuilder withOwnedDefault(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ParameterableElement> p_parameterableElementBuilder) {
    m_featureOwnedDefaultBuilder = p_parameterableElementBuilder;
    return this;
  }

  public OperationTemplateParameterBuilder withOwnedParameteredElement(org.eclipse.uml2.uml.ParameterableElement p_ownedParameteredElement) {
    m_ownedParameteredElement = p_ownedParameteredElement;
    m_featureOwnedParameteredElementSet = true;
    return this;
  }

  public OperationTemplateParameterBuilder withOwnedParameteredElement(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ParameterableElement> p_parameterableElementBuilder) {
    m_featureOwnedParameteredElementBuilder = p_parameterableElementBuilder;
    return this;
  }

  public OperationTemplateParameterBuilder withParameteredElement(org.eclipse.uml2.uml.ParameterableElement p_parameteredElement) {
    m_parameteredElement = p_parameteredElement;
    m_featureParameteredElementSet = true;
    return this;
  }

  public OperationTemplateParameterBuilder withParameteredElement(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.ParameterableElement> p_parameterableElementBuilder) {
    m_featureParameteredElementBuilder = p_parameterableElementBuilder;
    return this;
  }

  public OperationTemplateParameterBuilder withSignature(org.eclipse.uml2.uml.TemplateSignature p_signature) {
    m_signature = p_signature;
    m_featureSignatureSet = true;
    return this;
  }

  public OperationTemplateParameterBuilder withSignature(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.TemplateSignature> p_templateSignatureBuilder) {
    m_featureSignatureBuilder = p_templateSignatureBuilder;
    return this;
  }

  public OperationTemplateParameterBuilder withEAnnotations(org.eclipse.emf.ecore.EAnnotation p_eAnnotations) {
    m_eAnnotations.add(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public OperationTemplateParameterBuilder withEAnnotations(java.util.Collection<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotations) {
    m_eAnnotations.addAll(p_eAnnotations);
    m_featureEAnnotationsSet = true;
    return this;
  }

  public OperationTemplateParameterBuilder withEAnnotations(org.eclipse.emf.ecore.util.builder.IEcoreBuilder<? extends org.eclipse.emf.ecore.EAnnotation> p_eAnnotationBuilder) {
    m_featureEAnnotationsBuilder.add(p_eAnnotationBuilder);
    return this;
  }

  public OperationTemplateParameterBuilder withOwnedComment(org.eclipse.uml2.uml.Comment p_ownedComment) {
    m_ownedComment.add(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public OperationTemplateParameterBuilder withOwnedComment(java.util.Collection<? extends org.eclipse.uml2.uml.Comment> p_ownedComment) {
    m_ownedComment.addAll(p_ownedComment);
    m_featureOwnedCommentSet = true;
    return this;
  }

  public OperationTemplateParameterBuilder withOwnedComment(org.eclipse.uml2.uml.util.builder.IUmlBuilder<? extends org.eclipse.uml2.uml.Comment> p_commentBuilder) {
    m_featureOwnedCommentBuilder.add(p_commentBuilder);
    return this;
  }
}
